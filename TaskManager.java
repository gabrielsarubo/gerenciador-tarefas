import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {

  // Store the list of tasks
  static ArrayList<String> tasks = new ArrayList<String>();

  public static void main(String[] args) {
    int taskOp = -1;
    String newTask = "";
    char op = '\0';

    Scanner sc = new Scanner(System.in);

    while (op != 'q') {
      displayMenu();
      System.out.print("\nEscolha uma opcao: ");
      op = sc.next().charAt(0);

      switch (op) {
        case 'n':
          System.out.print("\n## Digite o titulo da nova tarefa: ");
          newTask = sc.next();
          // System.out.println(newTask);
          tasks.add(newTask);
          break;

        case 'l':
          System.out.println("\n\n## Lista de tarefas");
          listTasks();
          break;

        case 'c':
          listTasks();
          System.out.print("\n\n## Digite o numero da tarefa a ser completada: ");
          taskOp = sc.nextInt();
          tasks.remove(taskOp - 1);

          break;

        default:
          break;
      }
    }
  }

  /**
   * Ask the user whether they want to:
   * - add a task
   * - complete a task
   * - exit the program
   */
  public static void displayMenu() {
    System.out.println("\n\n# Menu\n"
        + "\n[n] Nova tarefa"
        + "\n[l] Listar tarefas"
        + "\n[c] Completar tarefa"
        + "\n[q] Sair");
  }

  /**
   * Display the list of tasks to be done
   */
  public static void listTasks() {
    for (int i = 0; i < tasks.size(); i++) {
      System.out.printf("\n[%d] %s", i+1, tasks.get(i));
    }
  }
}
