package generic_types.ex4;

import java.time.LocalDateTime;

class Newspaper extends Multimedia{

    private LocalDateTime releaseDate;

    public Newspaper(String name, LocalDateTime releaseDate) {
        super(name);
        this.releaseDate = releaseDate;
    }

    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "name= " + super.getName() +
                "releaseDate=" + releaseDate +
                '}';
    }
}
