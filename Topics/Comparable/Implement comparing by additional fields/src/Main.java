class Article implements Comparable<Article> {
    private String title;
    private int size;

    public Article(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public String getTitle() {
        return this.title;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public int compareTo(Article otherArticle) {
        return this.getSize() == otherArticle.getSize() ? compareTitles(otherArticle) : (getSize() > otherArticle.getSize()) ? 1 : -1;
    }

    public int compareTitles(Article otherArticle) {
        return this.getTitle().compareTo(otherArticle.getTitle());
    }
}