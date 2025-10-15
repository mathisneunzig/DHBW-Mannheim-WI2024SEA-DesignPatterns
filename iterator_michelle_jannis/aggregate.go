package main

type Aggregate[T any] interface {
	GetIterator() Iterator[T]
}

// Implements Aggregate
type Playlist struct {
	Songs []Song
}

func (p *Playlist) Add(song Song) {
	p.Songs = append(p.Songs, song)
}

func (p *Playlist) GetIterator() Iterator[Song] {
	return &PlaylistIterator{
		counter: 0,
		songs:   p.Songs,
	}
}

// Implements Aggregate
type CD struct {
	Songs []Song
}

func (p *CD) Add(song Song) {
	p.Songs = append(p.Songs, song)
}

func (p *CD) GetIterator() Iterator[Song] {
	return &CDIterator{
		counter: 0,
		songs:   p.Songs,
	}
}
