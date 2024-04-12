import SwiftUI
import shared

struct HomeScreen: View {
    
    @StateObject var viewModel = HomeViewModel()
    
    let gridColums: [GridItem] = Array(repeating: GridItem(.flexible(), spacing: 16), count: 2)
    
	var body: some View {
        NavigationStack {
            
            ScrollView {
                LazyVGrid(columns: gridColums, spacing: 12) {
                    ForEach(viewModel.movies, id: \.id) { movie in
                        NavigationLink(value: movie) {
                            MovieGridItem(movie: movie)
                                .task {
                                    if movie == viewModel.movies.last && !viewModel.isLoading && !viewModel.loadFinished {
                                        await viewModel.loadMovies()
                                    }
                                }
                        }
                        .buttonStyle(PlainButtonStyle())
                    }
                    
                    if viewModel.isLoading {
                        Section(footer: ProgressView()){}
                    }
                }
                .padding(.horizontal, 16)
                .navigationDestination(for: Movie.self) { movie in
                    DetailScreen(movie: movie)
                }
            }
            .navigationTitle("Movies App")
        }
        .task {
            await viewModel.loadMovies()
        }
	}
}

#Preview {
    HomeScreen()
}
