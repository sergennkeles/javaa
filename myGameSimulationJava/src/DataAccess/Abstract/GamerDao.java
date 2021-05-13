package DataAccess.Abstract;


import Entities.Concrete.Gamer;

public interface GamerDao {
	

void add(Gamer gamer);
void update(Gamer gamer);
void delete (Gamer gamer);

}
