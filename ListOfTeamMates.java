import java.util.ArrayList;

public class ListOfTeamMates {

    public static void main(String[] args) {
        ArrayList<TeamMate> teamMates = new ArrayList<TeamMate>();
        for (int i = 0; i < 20; i++) {

            TeamMate mate = new TeamMate(NameGenerator.GenerateName());
            // id gerado automaticamente
            // se o id gerado começar com uma letra o aluno esta presente
            // se não ele ficara ausente
            char initLetter = mate.getUserId().charAt(0);
            if (initLetter > 'a' && initLetter < 'z') {
                mate.setOnline(true);
            }
            teamMates.add(mate);
        }

        for (TeamMate mate : teamMates) {
            if (mate.getOnline()) {
                System.out.println("ID do Aluno: " + mate.getUserId());
                System.out.println("Nome do Aluno: " + mate.getName());
            }
        }
    }
}