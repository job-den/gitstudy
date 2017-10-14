package gitoverview;

/**
 * Created by Denis on 14.10.2017.
 */
public class BaseEntity {
    private  Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                '}';
    }

    public Boolean isNew(){
        return id == null;
    }
}
