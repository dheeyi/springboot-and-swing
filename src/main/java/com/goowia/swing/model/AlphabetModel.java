package com.goowia.swing.model;
import javax.persistence.*;

@Entity
@Table (name = "Alphabet")
public class AlphabetModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "letter", length = 200, nullable = false)
    private String letter;

    public AlphabetModel() {

    }

    public AlphabetModel(String letter) {
        this.letter = letter;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
}
