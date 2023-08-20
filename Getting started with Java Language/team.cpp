#include <iostream>
using namespace std;

int main() {
    Team team1 = new Team("Team1", 2, 3, 4);
    cout <<team1.getName(); << endl;
    cout <<team1.getWins(); << endl;
    cout <<team1.getLosses(); << endl;
    cout << "Hello, World!"; << endl;
    return 0;
}

class Team() {
    private:
        string name;
        int wins;
        int losses;
        int draws;

    public:
    Team(String, int , int, int);
    string getName();
    int getWins();
    int getLosses();
    int getDraws();
}

Team::Team(string name, int wins, int losses, int draws) {
    this->name = name;
    this->wins = wins;
    this->losses = losses;
    this->draws = draws;
}

    string Team::getName() {
        return name;
    }

    int Team::getWins() {
        return wins;
    }

    int Team::getLosses() {
        return losses;
    }
