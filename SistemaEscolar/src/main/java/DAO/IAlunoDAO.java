package DAO;

import model.Aluno;

import java.util.List;

public interface IAlunoDAO {
    //CRUD
    //C - Create
    void salvar(Aluno aluno);
    //R - Read
    List<Aluno> listartodosAlunos();
    //U - Update
    void atualizarAluno(Aluno aluno);
    //D - Delete
    void excluirAluno(int id);
}
