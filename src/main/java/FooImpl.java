import lombok.Getter;

interface FooInterface {
  int getIntField();
}

@Getter
public class FooImpl implements FooInterface {
  /*
   * If the IntelliJ Lombok plugin is installed then the following compilation error
   * is not reported in the editor.
   * Error: getIntField() in FooImpl cannot implement getIntField() in FooInterface
   * return type java.lang.String is not compatible with int
   */
  String intField;
}
