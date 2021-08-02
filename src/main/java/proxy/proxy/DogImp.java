package proxy.proxy;

import proxy.proxy.annon.Seven;
import proxy.proxy.imp.AnimalInterface;

public class DogImp implements AnimalInterface {

    @Seven(value = "Lumia")
    private String name;

    private String Property;

    public DogImp() {
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void say() {
        System.out.println("Dog Say");
    }

    @Override
    @Seven(Property = "property")
    public void setProperty(String Property) {
        this.Property = Property;
    }

    @Override
    public void getProperty() {
        System.out.println(this.name + this.Property);
    }
}
