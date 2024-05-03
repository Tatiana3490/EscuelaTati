package com.svalero.EscuelaTati.dao;

import com.svalero.EscuelaTati.domain.Cursos;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.UseRowMapper;

import java.util.List;

public interface CursosDao {
    @SqlQuery("SELECT * FROM Estudiantes")
    @UseRowMapper(CursosMapper.class)
    List<Cursos> getAllCursos();
}
