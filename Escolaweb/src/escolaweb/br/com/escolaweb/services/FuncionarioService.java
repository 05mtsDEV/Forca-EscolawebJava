import java.util.ArrayList;
import java.util.List;

public class FuncionarioService {
    private List<Funcionario> funcionarios = new ArrayList<>();
    
    public void create(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    public List<Funcionario> read() {
        return funcionarios;
    }
    
    public void update(int codigo, Funcionario funcionario) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getCodigo() == codigo) {
                funcionarios.set(i, funcionario);
                break;
            }
        }
    }
    
    public void delete(int codigo) {
        Funcionario funcionario = null;
        for (Funcionario f : funcionarios) {
            if (f.getCodigo() == codigo) {
                funcionario = f;
                break;
            }
        }
        if (funcionario != null) {
            funcionarios.remove(funcionario);
        }
    }
}


funcionarioService.delete(1);
funcionarios = funcionarioService.read();

for (Funcionario funcionario : funcionarios) {
    System.out.println("Nome: " + funcionario.getNome());
    System.out.println("CPF: " + funcionario.getCpf());
    System.out.println("Código: " + funcionario.getCodigo());
    System.out.println("Salário: " + funcionario.getSalario());
    System.out.println("-----------------------------");
}






