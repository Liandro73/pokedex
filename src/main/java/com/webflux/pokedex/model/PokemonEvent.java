package com.webflux.pokedex.model;

import java.util.Objects;

public class PokemonEvent {

    private Long id;
    private String eventType;

    public PokemonEvent(Long id, String eventType) {
        this.id = id;
        this.eventType = eventType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PokemonEvent)) return false;
        PokemonEvent that = (PokemonEvent) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(eventType, that.eventType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eventType);
    }

    @Override
    public String toString() {
        return "PokemonEvent{" +
                "id=" + id +
                ", eventType='" + eventType + '\'' +
                '}';
    }

}
