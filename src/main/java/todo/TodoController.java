// Controller
package todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    // Inject all todos in Controller
    @Autowired
    private TodoService todoService;

    // Get All Todos
    @RequestMapping("/getTodos")
    public List<Todo> getAll() {
        return todoService.getAllTodos();
    }
}
