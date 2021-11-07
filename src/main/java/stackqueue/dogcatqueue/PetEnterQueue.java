package stackqueue.dogcatqueue;

public class PetEnterQueue {
    private Pet pet;
    private Long count;

    public PetEnterQueue(Pet pet,Long count){
        this.pet = pet;
        this.count = count;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getType(){
        return this.pet.getType();
    }
}
