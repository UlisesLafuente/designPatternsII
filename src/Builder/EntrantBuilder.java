package Builder;

public interface EntrantBuilder {
    MainCourseBuilder withMainCourse(String mainCourse);
    EntrantBuilder isVegan();
    EntrantBuilder isGlutenFree();
}
