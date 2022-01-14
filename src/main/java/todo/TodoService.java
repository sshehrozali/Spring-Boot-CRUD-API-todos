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

    // Return all TODOs
    public List<Todo> getAllTodos() {
        return todos;
    }

    // Return TODO BY ID
//    public Todo getTodoBYID(int TODOid) {
//        return todos.stream().filter(t -> t.getID().eqauls(TODOid)).findFirst().get();
//    }

    public void createTodo(Todo todo) {
        todos.add(todo);    // Adding User passed todo Object into todos
    }
}
