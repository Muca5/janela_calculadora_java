<?php

class Pessoa {
    private $id;
    private $nome;
    private $endereco;
    private $bairro;
    private $cep;
    private $cidade;
    private $estado;
    private $telefone;
    private $celular;

    public function getId() {
        return $this->id;
    }
    public function setId($id) {
        $this->id = $id;
    }

    public function getNome() {
        return $this->nome;
    }
    public function setNome($nome) {
        $this->id = $nome;
    }

    public function getEndereco() {
        return $this->endereco;
    }
    public function setEndereco($endereco) {
        $this->id = $endereco;
    }

    public function getBairro() {
        return $this->bairro;
    }
    public function setBairro($bairro) {
        $this->id = $bairro;
    }

    public function getCep() {
        return $this->cep;
    }
    public function setCep($cep) {
        $this->id = $cep;
    }

    public function getCidade() {
        return $this->cidade;
    }
    public function setCidade($cidade) {
        $this->id = $cidade;
    }

    public function getEstado() {
        return $this->estado;
    }
    public function setEstado($estado) {
        $this->id = $estado;
    }

    public function getTelefone() {
        return $this->telefone;
    }
    public function setTelefone($telefone) {
        $this->id = $telefone;
    }

    public function getCelular() {
        return $this->celular;
    }
    public function setCelular($celular) {
        $this->id = $celular;
    }

}
   
    



?>