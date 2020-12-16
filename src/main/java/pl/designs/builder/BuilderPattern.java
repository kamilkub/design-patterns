package pl.designs.builder;

public class BuilderPattern {

    private Long id;
    private String name;


    private BuilderPattern(){}


    public static class Builder {

        private Long builderId;
        private String builderName;

        public Builder id(Long id){
            this.builderId = id;
            return this;
        }

        public Builder name(String name){
            this.builderName = name;
            return this;
        }

        public BuilderPattern build(){
            BuilderPattern pattern = new BuilderPattern();
            pattern.id = this.builderId;
            pattern.name = this.builderName;
            return pattern;
        }

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
