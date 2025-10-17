package main

type Iterator[T any] interface {
	next() T
	hasNext() bool
}

// Implements Iterator
type PlaylistIterator struct {
	counter int
	songs   []Song
}

func (i *PlaylistIterator) hasNext() bool {
	return i.counter < len(i.songs)
}

func (i *PlaylistIterator) next() Song {
	song := i.songs[i.counter]
	i.counter++

	return song
}

// Implements Iterator
type CDIterator struct {
	counter int
	songs   []Song
}

func (i *CDIterator) hasNext() bool {
	return i.counter < len(i.songs)
}

func (i *CDIterator) next() Song {
	song := i.songs[i.counter]
	i.counter++

	return song
}
