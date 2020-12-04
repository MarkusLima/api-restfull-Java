/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Home
 */
@Entity
@XmlRootElement
public class Avaliacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private float AV1, AV2, AV3, APS1, APS2;
    private Professor professor;
    private Aluno aluno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getAV1() {
        return AV1;
    }

    public void setAV1(float AV1) {
        this.AV1 = AV1;
    }

    public float getAV2() {
        return AV2;
    }

    public void setAV2(float AV2) {
        this.AV2 = AV2;
    }

    public float getAV3() {
        return AV3;
    }

    public void setAV3(float AV3) {
        this.AV3 = AV3;
    }

    public float getAPS1() {
        return APS1;
    }

    public void setAPS1(float APS1) {
        this.APS1 = APS1;
    }

    public float getAPS2() {
        return APS2;
    }

    public void setAPS2(float APS2) {
        this.APS2 = APS2;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Avaliacao)) {
            return false;
        }
        Avaliacao other = (Avaliacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Avaliacao[ id=" + id + " ]";
    }

}
