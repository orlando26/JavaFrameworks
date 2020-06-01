interface Album {
    id?: number;
    title: string;
    releaseDate: string;
    price: string;
    genre: string;
}

interface Song {
    id?: number;
    albumId: number;
    title: string;
    time: string;
}

interface Person {
    id?: number;
    name: string;
    lastName: string;
    email: string;
    password: string;
}

interface Authenticate {
    email: string;
    password: string;
}