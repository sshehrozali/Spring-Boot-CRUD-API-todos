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


    // GET Method (READ)
    @RequestMapping("/getTodos")
    public List<Todo> getAll() {
        return todoService.getAllTodos();
    }

    // POST Method (CREATE)
    @RequestMapping(method = RequestMethod.POST, value = "/createTodo")
    public void create(@RequestBody Todo todo) {
        todoService.createTodo(todo);
    }

    // PUT Method (UPDATE)
    @RequestMapping(method = RequestMethod.PUT, value = "/update/{id}")
    public void update(@PathVariable Integer id, @RequestBody Todo todo) {
        todoService.updateTodo(todo, id);
    }

    // DELETE Method (DELETE)
    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
    public void delete(@PathVariable Integer id, @RequestBody Todo todo) {
        todoService.deleteTodo(todo, id);
    }

}
