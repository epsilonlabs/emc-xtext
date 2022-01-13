# EMC Driver for Xtext Grammars

This driver works around a [bug](https://bugs.eclipse.org/bugs/show_bug.cgi?id=446073) that prevents Xtext grammars from loading as EMF resources using EMF's regular API.

To load an Xtext grammar (`.xtext` file) with this driver
- Select the `Xtext Grammar` driver in the list of model types
- Select your `.xtext` grammar in the `Model file` field of the dialog
- Add the Xtext metamodel URI to the list of `Metamodels` (search for `xtext`)
