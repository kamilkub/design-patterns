package pl.designs.behavioral.interpreter;

public interface PermissionExpression {
    boolean interpret(User user);
}
