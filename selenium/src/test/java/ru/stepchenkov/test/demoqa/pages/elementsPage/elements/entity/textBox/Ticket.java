package ru.stepchenkov.test.demoqa.pages.elementsPage.elements.entity.textBox;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ticket {
    private String name;
    private String email;
    private String address;
    private String permanentAddress;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(name, ticket.name) && Objects.equals(email, ticket.email) && Objects.equals(address, ticket.address) && Objects.equals(permanentAddress, ticket.permanentAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, address, permanentAddress);
    }
}
