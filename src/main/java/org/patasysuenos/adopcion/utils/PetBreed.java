package org.patasysuenos.adopcion.utils;

import static org.patasysuenos.adopcion.utils.PetSpecie.*;

public enum PetBreed {

        // Razas de perros
        LABRADOR(DOG),
        GOLDEN_RETRIEVER(DOG),
        BULLDOG(DOG),
        BEAGLE(DOG),
        POODLE(DOG),

        // Razas de gatos
        PERSIAN(CAT),
        SIAMESE(CAT),
        MAINE_COON(CAT),
        BENGAL(CAT),
        RAGDOLL(CAT),

        // Razas de aves
        PARAKEET(BIRD),
        CANARY(BIRD),
        COCKATIEL(BIRD),
        LOVE_BIRD(BIRD),
        PARROT(BIRD),

        // Razas de conejos
        HOLLAND_LOP(RABBIT),
        NETHERLAND_DWARF(RABBIT),
        REX(RABBIT),
        ANGORA(RABBIT),
        FLEMISH_GIANT(RABBIT),

        // Razas de hámsters
        SYRIAN(HAMSTER),
        RUSSIAN(HAMSTER),
        CHINESE(HAMSTER),
        ROBOROVSKI(HAMSTER),

        // Razas de tortugas
        RED_EARED_SLIDER(TURTLE),
        AQUATIC_TURTLE(TURTLE),
        LAND_TORTOISE(TURTLE),

        // Razas de peces
        BETTA(FISH),
        GUPPY(FISH),
        GOLDFISH(FISH),
        NEON_TETRA(FISH);

        private final PetSpecie specie;

        PetBreed(PetSpecie specie) {
            this.specie = specie;
        }

        public PetSpecie getSpecie() {
            return specie;
        }

}
