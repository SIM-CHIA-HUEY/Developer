package fr.formation.developers.services;

import fr.formation.developers.domain.dtos.SkillCreate;
import fr.formation.developers.domain.dtos.SkillView;



public interface SkillService {
    /**
    1/ Toutes les méthodes d'une interface sont : public et abstract (et final ?)
    2/ nommage de la classe concrète : quand une interface et class ont le même nom, la convention est de nommer
    class : SkillServiceImpl et interface : SkillService OU class : SkillServiceImpl et interface : ISkillService.

    Là c'est pour le SKillServiceImpl
     */

    SkillView getById (Long id);

    void create (SkillCreate skill);

    SkillView getByName(String name);
    //二 ...laisse la machine implémenter la méthode ici puis ...
}
