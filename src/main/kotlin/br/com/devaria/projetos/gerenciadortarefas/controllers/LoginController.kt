package br.com.devaria.projetos.gerenciadortarefas.controllers

import br.com.devaria.projetos.gerenciadortarefas.dtos.ErroDTO
import br.com.devaria.projetos.gerenciadortarefas.dtos.LoginDTO
import net.bytebuddy.implementation.bytecode.Throw
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.lang.Exception

@RestController
@RequestMapping("api/login")
class LoginController {
    @PostMapping
    fun efetuarLogin(@RequestBody dto : LoginDTO) : ResponseEntity<Any>{
        try{
            throw RuntimeException("Testando uma exceção")

        }catch (e: Exception){
            return ResponseEntity(ErroDTO(HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Não foi possivel efetuar o login, tente novamente"),
                                    HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }
}