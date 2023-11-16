class Employee
  def initialize(attrs = {})
    @username = attrs[:username]
    @password = attrs[:password]
    @role = attrs[:role]
    @id = attrs[:id]
  end

  attr_reader :username, :password, :role
  attr_accessor :id

  def manager?
    @role == "manager"
  end

  def rider?
    @role == "rider"
  end
end
