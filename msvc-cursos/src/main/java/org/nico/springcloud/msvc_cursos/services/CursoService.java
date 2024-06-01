package org.nico.springcloud.msvc_cursos.services;

import org.nico.springcloud.msvc_cursos.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService {

    List<Curso>listar();
    Optional<Curso> porId(Long id);
    Curso guardar(Curso curso);
    void eliminar(Long id);













}