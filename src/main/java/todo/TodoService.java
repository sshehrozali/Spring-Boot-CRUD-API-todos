// Service
package todo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    // Make TODOs
    private List<Todo> todos = new ArrayList<>(
            Arrays.asList(
                    new Todo(1, "I am Todo No. 1"),
                    new Todo(2, "I am Todo No. 2"),
                    new Todo(3, "I am Todo No. 3")
            )
    );

    // READ
    public List<Todo> getAllTodos() {
        return todos;
    }

    // CREATE
    public void createTodo(Todo todo) {
        todos.add(todo);    // Adding User passed todo Object into todos
    }

    // UPDATE
    public void updateTodo(Todo todo, Integer id) {

        for (int i = 0; i < todos.size(); i++) {
            Todo t = todos.get(i);  // Get an object from DB

            // Check if that todo is present or not
            if (t.getID().equals(id)) {
                // IF present, then Update the Todo
                System.out.println("Todo Updated");
                todos.set(i, todo);
            }
        }
    }

    // DELETE
    public void deleteTodo(Todo todo, Integer id) {
        // Remove the todo if Id is matched
        todos.removeIf(t -> t.getID().equals(id));
        System.out.println("Todo Deleted");
    }
}
