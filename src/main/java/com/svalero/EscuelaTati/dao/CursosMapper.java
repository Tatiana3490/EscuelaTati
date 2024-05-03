package com.svalero.EscuelaTati.dao;

import com.svalero.EscuelaTati.domain.Cursos;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CursosMapper implements RowMapper<Cursos> {

        @Override
        public Cursos map(ResultSet rs, StatementContext ctx) throws SQLException {
            return new Cursos(rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("description");
            }
        }
