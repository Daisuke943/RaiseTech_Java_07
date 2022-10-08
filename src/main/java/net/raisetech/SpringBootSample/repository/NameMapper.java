package net.raisetech.SpringBootSample.repository;

import net.raisetech.SpringBootSample.entity.Movie;
import net.raisetech.SpringBootSample.entity.Name;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface NameMapper {
    @Select("SELECT * FROM names")
    List<Name> findAll();
    @Select("SELECT * FROM movies WHERE published_year = #{year}")
    List<Movie> findByYear(int year);
}
