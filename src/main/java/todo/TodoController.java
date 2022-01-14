// Controller
package todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    // Get Todo by ID
//    @RequestMapping("/get/{id}")
//    public Todo getTodoBYID(@PathVariable int id) {
//        return todoService.getTodoBYID(id);
//    }

    // POST Method
    @RequestMapping(method = RequestMethod.POST, value = "/createTodo")

    // Dont return anything JUST CREATE new todo
    public void create(@RequestBody Todo todo) {
        todoService.createTodo(todo);
    }



}
