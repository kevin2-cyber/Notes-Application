class Customer(db.Entity):
    orders = Set('Order')

class Order(db.Entity):
    customer = Required(Customer)

class Customer(db.Entity):
    orders = Set(lambda: Order)

class Order(db.Entity):
    items = Set("OrderItem")

class OrderItem(db.Entity):
    order = Required(Order)
class Order(db.Entity):
    items = Set("OrderItem")

class OrderItem(db.Entity):
    class Order(db.Entity):
    items = Set("OrderItem")

class OrderItem(db.Entity):
    order = Optional(Order)
    order = Optional(Order)