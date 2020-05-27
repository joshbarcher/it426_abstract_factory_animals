package animals.characters;

import animals.entities.Caretaker;

import java.util.Map;

public interface ICaretakers
{
    public Map<String, Caretaker> getAllCharacters();
    public Caretaker getCharacterByName(String fullName);
}

