from django.urls import path
from demo import views

#URLConfiguration
urlpatterns = [
    path('hello/', views.say_hello, name='hello'),
]