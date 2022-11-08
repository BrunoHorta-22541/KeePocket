package pt.estig.twdm.pdm.keep_pocket;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface MovementsDAO {
    @Query("SELECT * FROM Movement")
    List<Movement> getAll();

    @Query("SELECT * FROM Movement WHERE idMovements = :movementsId")
    Movement getById(long movementsId);

    @Query("SELECT * FROM Movement WHERE idUser = :userId AND value>0")
    List<Movement> getIncome(long userId);

    @Query("SELECT * FROM Movement WHERE idUser = :userId AND value<0")
    List<Movement> getExpense(long userId);

    @Query("SELECT SUM(value) AS totalSpent, * FROM Movement WHERE idUser = :userId GROUP BY idCategory")
    List<Movement> getTotalByUserId(long userId);

    @Delete
    void delete(Movement movements);

    @Update
    void update(Movement movements);


    @Insert
    void insert(Movement movements);
}
