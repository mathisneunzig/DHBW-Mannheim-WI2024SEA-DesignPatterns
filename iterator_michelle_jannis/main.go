package main

func main() {
	println("--- Iterator pattern in Go ---")

	// Create playlist
	p := Playlist{}
	p.Add(Song{Title: "Coding with vibes"})
	p.Add(Song{Title: "The great song"})

	// Create cd
	cd := CD{}
	cd.Add(Song{Title: "Classic mood"})

	// Print aggregates to console
	printToConsole(&p)
	printToConsole(&cd)
}

// This function uses the iterators
func printToConsole(content Aggregate[Song]) {
	i := content.GetIterator()

	for i.hasNext() {
		println("Title: " + i.next().Title)
	}
}
