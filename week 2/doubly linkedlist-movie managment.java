class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie next;
    Movie prev;

    Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

class MovieManagementSystem {
    Movie head, tail;

    void addMovieAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    void addMovieAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    void addMovieAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 1) {
            addMovieAtBeginning(title, director, year, rating);
            return;
        }
        Movie newMovie = new Movie(title, director, year, rating);
        Movie temp = head;
        int count = 1;
        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null || temp.next == null) {
            addMovieAtEnd(title, director, year, rating);
        } else {
            newMovie.next = temp.next;
            newMovie.prev = temp;
            temp.next.prev = newMovie;
            temp.next = newMovie;
        }
    }

    void removeMovieByTitle(String title) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }

    void searchByDirector(String director) {
        Movie temp = head;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | " + temp.rating);
            }
            temp = temp.next;
        }
    }

    void searchByRating(double rating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | " + temp.rating);
            }
            temp = temp.next;
        }
    }

    void displayForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | " + temp.rating);
            temp = temp.next;
        }
    }

    void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | " + temp.rating);
            temp = temp.prev;
        }
    }

    void updateRatingByTitle(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        MovieManagementSystem mms = new MovieManagementSystem();
        mms.addMovieAtEnd("Pathaan", "Siddharth Anand", 2023, 7.2);
        mms.addMovieAtBeginning("RRR", "S. S. Rajamouli", 2022, 8.1);
        mms.addMovieAtPosition(2, "Dangal", "Nitesh Tiwari", 2016, 8.3);
        mms.displayForward();
        System.out.println("Reverse:");
        mms.displayReverse();
        System.out.println("Search by Director:");
        mms.searchByDirector("S. S. Rajamouli");
        System.out.println("Search by Rating:");
        mms.searchByRating(8.3);
        mms.updateRatingByTitle("Dangal", 9.0);
        System.out.println("After Rating Update:");
        mms.displayForward();
        mms.removeMovieByTitle("RRR");
        System.out.println("After Removal:");
        mms.displayForward();
    }
}
