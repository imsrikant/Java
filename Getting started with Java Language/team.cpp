#include <iostream>
using namespace std;

class Team {
    private:
        string name;
        int wins;
        int losses;
        int draws;

    public:
        Team(string, int , int, int);
        string getName();
        int getWins();
        int getLosses();
        int getDraws();
};

int main() {
    Team team1("Team 1", 10, 5, 3);
    cout << team1.getName() << endl;
    cout << team1.getWins() << endl;
    cout << team1.getLosses() << endl;
    cout << team1.getDraws() << endl;
    cout << "Hello, World!" << endl;
    return 0;
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

    int Team::getDraws() {
    return draws;
    }
