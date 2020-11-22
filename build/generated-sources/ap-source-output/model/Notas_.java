package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Aluno;
import model.Professor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-21T18:51:34")
@StaticMetamodel(Notas.class)
public class Notas_ { 

    public static volatile SingularAttribute<Notas, Professor> professor;
    public static volatile SingularAttribute<Notas, Aluno> aluno;
    public static volatile SingularAttribute<Notas, Long> id;
    public static volatile SingularAttribute<Notas, Float> AV1;
    public static volatile SingularAttribute<Notas, Float> AV2;
    public static volatile SingularAttribute<Notas, Float> AV3;

}