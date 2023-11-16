require "faker"

class User < ActiveRecord::Base
  has_many :posts

  # TODO: Add some validation
  validates :username, presence: true
  validates :username, uniqueness: true

  validates :email, presence: true
  validates :email, format: { with: URI::MailTo::EMAIL_REGEXP }
  # TODO: Add some callbacks
  before_validation :strip
  after_validation :send_email

  private

  def strip
    email.strip! unless email.nil?
  end

  # Send welcome email
  def send_email
    FakeMailer.instance.mail(email, "Welcome to HN!")
  end
end
