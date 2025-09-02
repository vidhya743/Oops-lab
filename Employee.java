                    Employee e = new Employee(id, name, salary);
                    ps.addEmployee(e);
                } catch (Exception ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        ps.showPayroll();

        System.out.print("\nEnter ID of employee to remove: ");
        int rid = sc.nextInt();
        ps.removeEmployee(rid);
        ps.showPayroll();

        ps.undo();
        ps.showPayroll();

        sc.close();
    }
}
