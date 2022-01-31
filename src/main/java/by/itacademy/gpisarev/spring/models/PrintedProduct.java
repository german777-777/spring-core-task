package by.itacademy.gpisarev.spring.models;

import by.itacademy.gpisarev.spring.qualifiers.simple.BookQualifier;
import by.itacademy.gpisarev.spring.qualifiers.string.TypeStringQualifier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrintedProduct implements Printable {
    private int id;
    private String name;

    private Map<Integer, Author> authors;

    @Autowired
    @TypeStringQualifier(name = "book-qualifier")
    private Type type;

    public PrintedProduct(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public PrintedProduct(int id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public void init() {
        System.out.println("Печатный продукт '" + name + "' создан");
    }

    public void destroy() {
        System.out.println("Печатный продукт '" + name + "' разрушен");
    }
}
