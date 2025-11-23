from django.shortcuts import render
from django.http import HttpResponse
# Create your views here.

#Request handler
def say_hello(request):
    return render(request, 'demo/hello.html', {'name': 'Dhruv'})