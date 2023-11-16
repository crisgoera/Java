class Post < ActiveRecord::Base
  belongs_to :user


  # TODO: Add some validation
  before_validation :lower_case
  validates :title, :url, :user, presence: true
  validates :title, length: { minimum: 5 }
  validates :title, uniqueness: true
  validates :url, format: { with: URI::DEFAULT_PARSER.make_regexp }

  private

  def lower_case
    self.title = title.downcase unless title.nil?
  end
end
