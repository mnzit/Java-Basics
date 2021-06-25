package com.sudreeshya.daily.builder;

public class Department {

    private Long id;
    private String name;
    private Integer numberOfMember;

    public Department(Long id, String name, Integer numberOfMember) {
        this.id = id;
        this.name = name;
        this.numberOfMember = numberOfMember;
    }

    public static DepartmentBuilder builder() {
        return new DepartmentBuilder();
    }

    @Override public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfMember=" + numberOfMember +
                '}';
    }

    public static class DepartmentBuilder {
        private Long id;
        private String name;
        private Integer numberOfMember;

        public Long getId() {
            return id;
        }

        public DepartmentBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public DepartmentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public Integer getNumberOfMember() {
            return numberOfMember;
        }

        public DepartmentBuilder numberOfMember(Integer numberOfMember) {
            this.numberOfMember = numberOfMember;
            return this;
        }

        public Department build() {
            return new Department(id, name, numberOfMember);
        }
    }
}
