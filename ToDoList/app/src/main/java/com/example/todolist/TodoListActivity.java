package com.example.todolist;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class TodoListActivity extends Activity {
    private ListView todoList;
    private ArrayList<String> todos;
    private ArrayAdapter<String> adapter;
    private EditText todoInput;
    private Button addTodoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todoList = (ListView) findViewById(R.id.todo_list);
        todos = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, todos);
        todoList.setAdapter(adapter);

        todoInput = (EditText) findViewById(R.id.todo_input);
        addTodoButton = (Button) findViewById(R.id.add_todo);

        addTodoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTodo();
            }
        });

        todoList.setOnItemLongClickListener((parent, view, position, id) -> {
            deleteTodo(position);
            return true;
        });
    }

    private void addTodo() {
        String todo = todoInput.getText().toString();
        if (!todo.isEmpty()) {
            todos.add(todo);
            adapter.notifyDataSetChanged();
            todoInput.setText("");
        }
    }

    private void deleteTodo(int position) {
        todos.remove(position);
        adapter.notifyDataSetChanged();
    }
}