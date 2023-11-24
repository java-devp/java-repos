package com.test.intv;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Developer {

    private Integer id;
    private String name;
    private Set<String> book;

    //getters, setters, toString

    public void addBook(String book) {
        if (this.book == null) {
            this.book = new HashSet<>();
        }
        this.book.add(book);
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getBook() {
		return book;
	}

	public void setBook(Set<String> book) {
		this.book = book;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)	
			return false;
		if (getClass() != obj.getClass())
			return false;
		Developer other = (Developer) obj;
		return Objects.equals(book, other.book) && Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
    
    
}
